package org.apache.taverna.mobile.tavernamobile;

import java.net.Authenticator;
import java.net.PasswordAuthentication;

/**
 * Created by root on 6/13/15.
 */
public class TavernaPlayerAPI {
    public static final String PLAYER_URL = "http://heater.cs.man.ac.uk:3000/";
    public static final String SERVER_URL = "http://heater.cs.man.ac.uk:8090/taverna-2.5.4/";

    public TavernaPlayerAPI() {
    }

    public static class Authenticator extends java.net.Authenticator{
        private String username, password;

        public Authenticator(String username, String password) {
            super();
            this.username = username;
            this.password = password;
        }

        @Override
        protected PasswordAuthentication getPasswordAuthentication() {
            return new PasswordAuthentication(this.username, this.password.toCharArray());
        }
    }
}