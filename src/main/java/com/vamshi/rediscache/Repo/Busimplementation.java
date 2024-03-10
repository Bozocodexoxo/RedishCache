package com.vamshi.rediscache.Repo;

import com.vamshi.rediscache.model.Bustand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class Busimplementation implements Bintr{
    @Autowired
    JdbcTemplate jdbcTemplate;
    private String insert = "INSERT INTO Bustand (bid, dname, style) VALUES (?, ?, ?)";
    private String delete = "DELETE FROM Bustand WHERE bid = ?";
    private String tableView = "SELECT * FROM Bustand";
    @Override
    public List<Bustand> mytotal() {
        return jdbcTemplate.query(tableView,(rs, rowNum) ->
        {
            Bustand bustand=new Bustand();
            bustand.setBusid(rs.getInt("bid"));
            bustand.setDname(rs.getString("dname"));
            bustand.setStyle(rs.getString("style"));
                        return bustand;
        });

    }

    @Override
    public int findById(int id) {
        return 1
        ;
    }

    @Override
    public Bustand save(Bustand bs) {
         jdbcTemplate.update(insert,bs.getBusid(),bs.getDname(),bs.getStyle());
         return bs;
    }

    @Override
    public void delete(int id) {
jdbcTemplate.update(delete,id);
    }
}
