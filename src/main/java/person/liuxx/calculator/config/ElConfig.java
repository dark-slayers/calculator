package person.liuxx.calculator.config;

import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;

import com.alibaba.fastjson.JSON;

import person.liuxx.calculator.yd.HeroCard;
import person.liuxx.util.service.exception.SearchException;

/**
 * @author 刘湘湘
 * @version 1.0.0<br>
 *          创建时间：2017年8月30日 上午10:57:37
 * @since 1.0.0
 */
@Configuration
@ComponentScan
public class ElConfig
{
    private Logger log = LoggerFactory.getLogger(ElConfig.class);
    @Value("classpath:cards.json")
    private Resource cards;

    public List<HeroCard> listCard()
    {
        List<HeroCard> result = readText().map(t -> JSON.parseArray(t, HeroCard.class)).orElse(
                new ArrayList<>());
        log.debug("解析结果：{}", result);
        return result;
    }

    private Stream<String> getFile(Resource r)
    {
        try
        {
            return Files.lines(r.getFile().toPath());
        } catch (IOException e)
        {
            throw new SearchException("读取配置文件失败！", e);
        }
    }

    private Optional<String> readText()
    {
        return Optional.of(getFile(cards).collect(Collectors.joining()));
    }
}
