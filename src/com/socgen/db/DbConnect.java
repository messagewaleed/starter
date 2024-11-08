package com.socgen.db;

import java.sql.*;
import java.util.Scanner;

public class DbConnect {

    static Statement statement;



    public static void main(String[] args) {
        try {
            //        1. Load the Driver
            Class.forName(DbConfig.DB_DRIVERNAME);
//            2. Try establishing the connection
            Connection dbCon = DriverManager.getConnection(DbConfig.DB_URLTOCONNECT, DbConfig.DB_USERNAME, DbConfig.DB_PASSWORD);

            statement = dbCon.createStatement();

            System.out.println("ENter name and skills of the new participant");

            Scanner scan = new Scanner(System.in);


            addNewParticipant(scan.nextLine(), scan.nextLine());

            getAllParticipants();



//            getAllParticipants();



//            System.out.println("Connected to db now...");
        } catch (ClassNotFoundException e) {
            System.out.println("Issues loading the driver : " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("Issues while connecting to db : " + e.getMessage());
        }
    }

//    Get all participants
    static void getAllParticipants() {
//        Write the query
        String query = "select * from participants";

        try {
            //        Execute the query
            ResultSet resultSet = statement.executeQuery(query);

            System.out.println("Registered participants : ");
//            Traverse through the results
            while (resultSet.next()) {
                System.out.print(resultSet.getString("participant_name"));
                System.out.print(" with id : " + resultSet.getString("participant_id"));
                System.out.println(" and skills : " + resultSet.getString("participant_skills"));
            }
        } catch (SQLException e) {
            System.out.println("Issues while executing query to get all : " + e.getMessage());
        }
    }


//        Add new Participant
        static void addNewParticipant(String name, String skills){
            String query = "insert into participants(participant_name, participant_skills) values('" + name + "', '" + skills + "')";

            try {
                if(statement.executeUpdate(query) > 0)
                    System.out.println("New participant details registered...");
            } catch (SQLException e) {
                System.out.println("Issues while adding : " + e.getMessage());
            }
        }


    }



