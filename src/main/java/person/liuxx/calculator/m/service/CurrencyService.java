package person.liuxx.calculator.m.service;

import person.liuxx.calculator.m.currency.CurrencyTypeEnum;

/**
 * @author 刘湘湘
 * @since 2019年4月23日 下午5:02:31
 */
public interface CurrencyService
{
    long getNumberUseOneRMB(CurrencyTypeEnum currencyType);

    long getNumberUseRMB(long goldNumber, CurrencyTypeEnum out);

    long getRMBNumber(long goldNumber, CurrencyTypeEnum out);
}
