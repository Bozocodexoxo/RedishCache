package com.vamshi.rediscache.Repo;

import com.vamshi.rediscache.model.Bustand;

import java.util.List;

public interface Bintr {
    public List<Bustand> mytotal();
    public int findById(int id);
    public Bustand save(Bustand bs);
    public void delete (int id);

}
