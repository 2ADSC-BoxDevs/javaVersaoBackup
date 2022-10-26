
package com.mycompany.tela.login;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author Specula
 */
public class Conexao {

    private JdbcTemplate connection;

    public Conexao() {

        BasicDataSource dataSource = new BasicDataSource();

        dataSource​.setDriverClassName("com.mysql.cj.jdbc.Driver");

        // dataSource​.setUrl("jdbc:mysql://172.31.16.213:3306/specula"); Funcionando para local na VM
        
        dataSource​.setUrl("jdbc:mysql://localhost:3306/specula");

        dataSource​.setUsername("root");

        // dataSource​.setPassword("urubu100");
        dataSource​.setPassword("#Gf53187038875");

        this.connection = new JdbcTemplate(dataSource);

    }

    public JdbcTemplate getConnection() {

        return connection;

    }

}
