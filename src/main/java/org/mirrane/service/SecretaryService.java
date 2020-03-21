package org.mirrane.service;

import org.mirrane.dao.SecretaryDao;
import org.mirrane.dao.SecretaryDaoImp;
import org.mirrane.model.Secretary;

import java.util.List;

public class SecretaryService {

    SecretaryDao secretaryDao;

    public SecretaryService() {
        this.secretaryDao = new SecretaryDaoImp();
    }

    public List<Secretary> getSecretaryList() {
        return secretaryDao.getSecretaryList();
    }
}
