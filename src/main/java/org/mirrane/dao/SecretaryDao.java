package org.mirrane.dao;

import org.mirrane.model.Secretary;

import java.util.List;

public interface SecretaryDao {
    List<Secretary> getSecretaryList();
    void removeSecretary(String cin);
    void addSecretary(Secretary secretary);
    void updateSecretary(Secretary secretary);
    void  getSecretary(String cin);
}
