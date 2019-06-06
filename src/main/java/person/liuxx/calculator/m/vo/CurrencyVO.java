package person.liuxx.calculator.m.vo;

import lombok.Data;

/**
 * @author 刘湘湘
 * @since 2019年4月24日 下午5:19:58
 */
@Data
public class CurrencyVO
{
    private final long rmb;
    private final long gold;
    private final long timePoint;
    private final long energy;
    private final long fairyJade;

    public CurrencyVO(long rmb, long gold, long timePoint, long energy, long fairyJade)
    {
        this.rmb = rmb;
        this.gold = gold;
        this.timePoint = timePoint;
        this.energy = energy;
        this.fairyJade = fairyJade;
    }
}
