
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

        dataSource​.setUrl("jdbc:mysql://localhost/specula");

        dataSource​.setUsername("root");

        dataSource​.setPassword("#Gf53187038875");

        this.connection = new JdbcTemplate(dataSource);

    }

    public JdbcTemplate getConnection() {

        return connection;

    }

}
