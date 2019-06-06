package person.liuxx.calculator.m.service.impl;

import org.springframework.stereotype.Service;

import person.liuxx.calculator.m.currency.CurrencyTypeEnum;
import person.liuxx.calculator.m.service.CurrencyService;

/**
 * @author 刘湘湘
 * @since 2019年4月23日 下午5:14:20
 */
@Service
public class CurrencyServiceImpl implements CurrencyService
{
    private static final long TEN_MILLION = 10_000_000;

    @Override
    public long getNumberUseOneRMB(CurrencyTypeEnum currencyType)
    {
        switch (currencyType)
        {
        case ENERGY:
            {
                return 0L;
            }
        case FAIRY_JADE:
            {
                return 0L;
            }
        case GOLD:
            {
                return 0L;
            }
        case RMB:
            {
                return 0L;
            }
        case TIME_POINT:
            {
                return 0L;
            }
        default:
            {
                return 0L;
            }
        }
    }

    @Override
    public long getNumberUseRMB(long money, CurrencyTypeEnum out)
    {
        return money * getNumberUseOneRMB(out) / TEN_MILLION;
    }

    @Override
    public long getRMBNumber(long goldNumber, CurrencyTypeEnum out)
    {
        return 0L;
    }
}
