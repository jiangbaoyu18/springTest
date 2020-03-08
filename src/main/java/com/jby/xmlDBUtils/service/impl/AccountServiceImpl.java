package com.jby.xmlDBUtils.service.impl;

import com.jby.xmlDBUtils.dao.IAccountDao;
import com.jby.xmlDBUtils.domain.Account;
import com.jby.xmlDBUtils.service.IAccountService;

import java.util.List;

/**
 * 账户的业务层实现类
 */
public class AccountServiceImpl implements IAccountService {

    private IAccountDao accountDao;

    public void setAccountDao(IAccountDao accountDao) {
        this.accountDao = accountDao;
    }

    public List<Account> findAllAccount() {
        return accountDao.findAllAccount();
    }

    public Account findAccountById(Integer accountId) {
        return accountDao.findAccountById(accountId);
    }

    public void saveAccount(Account account) {
        accountDao.saveAccount(account);
    }

    public void updateAccount(Account account) {
        accountDao.updateAccount(account);
    }

    public void deleteAccount(Integer acccountId) {
        accountDao.deleteAccount(acccountId);
    }
}
