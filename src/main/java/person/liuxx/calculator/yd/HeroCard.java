package person.liuxx.calculator.yd;

import java.util.List;

import lombok.Data;

/**
 * @author 刘湘湘
 * @version 1.0.0<br>
 *          创建时间：2019年9月11日 下午1:15:17
 * @since 1.0.0
 */
@Data
public class HeroCard
{
    private Long id;
    private String name;
    private int cost;
    private int level;
    private List<String> characters;
}
