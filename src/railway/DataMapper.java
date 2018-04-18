package railway;

import java.sql.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by pro-27 on 16.04.2018.
 */
public class DataMapper {

    public HashSet<City> loadCities() throws ClassNotFoundException {

        HashSet<City> Cities = new HashSet<>();

        String address = "jdbc:postgresql://localhost:5432/railwey";
        Class.forName("org.postgresql.Driver");

        try {
            Connection connection = DriverManager.getConnection(address, "postgres", "123");
            Statement statement = connection.createStatement();
            String query = "Select name From cities;";
            ResultSet result = statement.executeQuery(query);

            while (result.next()) {

                String name = result.getString("name");

                City city = new City(name);
                Cities.add(city);

            }

        } catch (SQLException e) {

            System.out.println(e.getMessage());
            System.out.println(e.getSQLState());

        }

        return Cities;

    }

    public HashSet<Trip> loadTrip() throws ClassNotFoundException {

        HashSet<Trip> trips = new HashSet<>();

        String address = "jdbc:postgresql://localhost:5432/railwey";
        Class.forName("org.postgresql.Driver");

        try {
            Connection connection = DriverManager.getConnection(address, "postgres", "123");
            Statement statement = connection.createStatement();
            String query = "Select ID,number,city_from,city_to,departure_date,foreign From trips;";
            ResultSet result = statement.executeQuery(query);

            while (result.next()) {

                int id = result.getInt("ID");
                String namber = result.getString("number");
                String cityFrom = result.getString("city_from");
                String cityTo = result.getString("city_to");
                Date DipDate = result.getDate("departure_date").;
                
                
                City cityFromLink = loadCities().stream().filter(c -> c.name == cityFrom).collect(Collectors.toList()).get(0);
                City cityToLink = loadCities().stream().filter(c -> c.name == cityTo).collect(Collectors.toList()).get(0);
                String pattern = "HH:mm:ss dd.MM.yyyy";
                DateTimeFormatter f = DateTimeFormatter.ofPattern(pattern);
                LocalDateTime date_ = LocalDateTime.parse(date, f);
                
                
                
                City city = new City(name);
                trips.add(city);

            }

        } catch (SQLException e) {

            System.out.println(e.getMessage());
            System.out.println(e.getSQLState());

        }

        return Cities;

    }

}
