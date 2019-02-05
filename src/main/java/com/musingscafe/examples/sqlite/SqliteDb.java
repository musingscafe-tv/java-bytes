package com.musingscafe.examples.sqlite;

import java.sql.*;
import java.util.Objects;

public class SqliteDb {

    public void addCreatedDate(String fileName) {
        final String alterSql = "alter table yt_video add column created_at int;";
        final String url = "jdbc:sqlite:" + fileName;

        try (final Connection connection = DriverManager.getConnection(url)) {
            final Statement statement = connection.createStatement();
            statement.execute(alterSql);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        final SqliteDb sqliteDb = new SqliteDb();
        sqliteDb.addCreatedDate("jinni.db");
    }


    public void addExistingColumn(String fileName) {

    }
    public void newVideoTable(String fileName) {
        final String sql = "create table if not exists yt_video (\n" +
                "\tvideo_id char(36) primary key,\n" +
                "\ttitle text,\n" +
                "\turl text\n" +
                ");";
        final String url = "jdbc:sqlite:" + fileName;
        try (final Connection connection = DriverManager.getConnection(url)){
            final Statement statement = connection.createStatement();

            statement.execute(sql);

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            throw new RuntimeException(e);
        }
    }

    private static void newVideoTableRunner() {
        final SqliteDb sqliteDb = new SqliteDb();
        sqliteDb.newVideoTable("jinni.db");
    }


    public Connection connect(String fileName) throws SQLException {
        final String url = "jdbc:sqlite:" + fileName;
        return DriverManager.getConnection(url);
    }

    private static void connectWithExistingDbRunner() {
        final SqliteDb sqliteDb = new SqliteDb();
        try {
            final Connection connection = sqliteDb.connect("jinni.db");
            if (Objects.nonNull(connection)) {
                System.out.println("Connected with " + connection.getMetaData().getDriverName());
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            throw new RuntimeException(e);
        }
    }


    public void newDb(String fileName) {
        final String url = "jdbc:sqlite:" + fileName;

        try (final Connection connection = DriverManager.getConnection(url)) {
            if (connection != null) {
                final DatabaseMetaData databaseMetaData = connection.getMetaData();
                System.out.println("Connected with " + databaseMetaData.getDriverName());
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            throw new RuntimeException(e);
        }
    }

    private static void newDBRunner() {
        final SqliteDb sqliteDb = new SqliteDb();
        sqliteDb.newDb("jinni.db");
    }
}
