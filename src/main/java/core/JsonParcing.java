package core;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.text.DecimalFormat;

import javax.json.Json;
import javax.json.stream.JsonParser;
import javax.json.stream.JsonParser.Event;

public class JsonParcing {

	public static void main(String[] args) throws IOException {       
        
        //final String element_01 = "id";
        final String element_02 = "Rate";
        final String country_name = "geoplugin_countryName";
        final String currency_code = "geoplugin_currencyCode";
       
        String us_code = "USD";       
       
        String item_01_name = "Soccer Ball";
        Double item_01_usd_price = 140.49;
       
        String item_02_name ="Activity Tracker";
		Double item_02_usd_price =99.95;
		
		String item_03_name ="Samsung Galaxy 4";
		Double item_03_usd_price = 79.90;
		
		String item_04_name =" Go Pro HERO3 camera";
		Double item_04_usd_price = 354.98;
		
		String item_05_name ="Apple iPhone 5s";
		Double item_05_usd_price = 489.99;
		
        String ip_address_01 = "88.191.179.56";
        String ip_address_02 = "61.135.248.220";
        String ip_address_03 = "92.40.254.196";
        String ip_address_04 = "93.183.203.67";
        String ip_address_05 = "213.87.141.36";
       
        String country_01_name = ""; // France
        String country_02_name = ""; // China
        String country_03_name = ""; // United Kingdom
        String country_04_name = ""; // Ukraine
        String country_05_name = ""; // Russia                
       
        String country_01_code = "";    // EUR => us_code + country_01_code = USDEUR
        String country_02_code = "";    // CNY => us_code + country_02_code = USDCNY
        String country_03_code = "";    // GBP => us_code + country_03_code = USDGBP
        String country_04_code = "";    // UAH => us_code + country_04_code = USDUAH
        String country_05_code = "";    // RUB => us_code + country_05_code = USDRUB
       
        Double item_01_eur_price = 0.0; //  127.51
        Double item_01_cny_price = 0.0; //  891.82
        Double item_01_gbp_price = 0.0; // 91.74
        Double item_01_uah_price = 0.0; // 3196.29
        Double item_01_rub_price = 0.0; // 8683.34
       
        Double item_02_eur_price = 0.0; // 90.71
        Double item_02_cny_price = 0.0; // 634.47
        Double item_02_gbp_price = 0.0; //   65.27
        Double item_02_uah_price = 0.0; // 2273.96
        Double item_02_rub_price = 0.0; // 617766
       
        Double item_03_eur_price = 0.0; //  72.52
        Double item_03_cny_price = 0.0; //  507.20
        Double item_03_gbp_price = 0.0; // 52.17
        Double item_03_uah_price = 0.0; // 1817.8
        Double item_03_rub_price = 0.0; // 4938.42
       
        Double item_04_eur_price = 0.0; //   322.8
        Double item_04_cny_price = 0.0; //  2253.38
        Double item_04_gbp_price = 0.0; //   231.8
        Double item_04_uah_price = 0.0; //  21940.43
        Double item_04_rub_price = 0.0; // 22053.5
       
        Double item_05_eur_price = 0.0; //   444.71
        Double item_05_cny_price = 0.0; //  3110.41
        Double item_05_gbp_price = 0.0; //   319.96
        Double item_05_uah_price = 0.0; //  11147.76
        Double item_05_rub_price = 0.0; // 30285.06
       
        URL url1 = new URL("http://www.geoplugin.net/json.gp?ip=" + ip_address_01);
        URL url2 = new URL("http://www.geoplugin.net/json.gp?ip=" + ip_address_02);
        URL url3 = new URL("http://www.geoplugin.net/json.gp?ip=" + ip_address_03);
        URL url4 = new URL("http://www.geoplugin.net/json.gp?ip=" + ip_address_04);
        URL url5 = new URL("http://www.geoplugin.net/json.gp?ip=" + ip_address_05);
       
        InputStream is1 = url1.openStream();
        JsonParser parser1 = Json.createParser(is1);

        while (parser1.hasNext()) {

        Event e1 = parser1.next();

        if (e1 == Event.KEY_NAME) {

            switch (parser1.getString()) {

            case country_name:
                parser1.next();
                country_01_name = parser1.getString();
            break;

            case currency_code:
                parser1.next();
                country_01_code = parser1.getString();
            break;
           
            } // switch
        } // if
    } // while
       
        InputStream is2 = url2.openStream();
        JsonParser parser2 = Json.createParser(is2);

        while (parser2.hasNext()) {

        Event e2 = parser2.next();

        if (e2 == Event.KEY_NAME) {

            switch (parser2.getString()) {

            case country_name:
                parser2.next();
                country_02_name = parser2.getString();
            break;

            case currency_code:
                parser2.next();
                country_02_code = parser2.getString();
            break;
           
            } // switch
        } // if
    } // while
       
        InputStream is3 = url3.openStream();
        JsonParser parser3 = Json.createParser(is3);

        while (parser3.hasNext()) {

        Event e3 = parser3.next();

        if (e3 == Event.KEY_NAME) {

            switch (parser3.getString()) {

            case country_name:
                parser3.next();
                country_03_name = parser3.getString();
            break;

            case currency_code:
                parser3.next();
                country_03_code = parser3.getString();
            break;
           
            } // switch
        } // if
    } // while
       
        InputStream is4 = url4.openStream();
        JsonParser parser4 = Json.createParser(is4);

        while (parser4.hasNext()) {

        Event e4 = parser4.next();

        if (e4 == Event.KEY_NAME) {

            switch (parser4.getString()) {

            case country_name:
                parser4.next();
                country_04_name = parser4.getString();
            break;

            case currency_code:
                parser4.next();
                country_04_code = parser4.getString();
            break;
           
            } // switch           
        } // if
    } // while
       
        InputStream is5 = url5.openStream();
        JsonParser parser5 = Json.createParser(is5);

        while (parser5.hasNext()) {

        Event e5 = parser5.next();

        if (e5 == Event.KEY_NAME) {

            switch (parser5.getString()) {

            case country_name:
                parser5.next();
                country_05_name = parser5.getString();
            break;

            case currency_code:
                parser5.next();
                country_05_code = parser5.getString();
            break;
           
            } // switch            
        } // if
    } // while
       
        URL url_rate_01 = new URL("http://query.yahooapis.com/v1/public/yql?q"
                + "=select%20*%20from%20yahoo.finance.xchange%20where%20pair%20in%20%28%22"
                + us_code + country_01_code + "%22%29&format=json&env=store:"
                        + "//datatables.org/alltableswithkeys");
        URL url_rate_02 = new URL("http://query.yahooapis.com/v1/public/yql?q"
                + "=select%20*%20from%20yahoo.finance.xchange%20where%20pair%20in%20%28%22"
                + us_code + country_02_code + "%22%29&format=json&env=store:"
                        + "//datatables.org/alltableswithkeys");
        URL url_rate_03 = new URL("http://query.yahooapis.com/v1/public/yql?q"
                + "=select%20*%20from%20yahoo.finance.xchange%20where%20pair%20in%20%28%22"
                + us_code + country_03_code + "%22%29&format=json&env=store:"
                        + "//datatables.org/alltableswithkeys");
        URL url_rate_04 = new URL("http://query.yahooapis.com/v1/public/yql?q"
                + "=select%20*%20from%20yahoo.finance.xchange%20where%20pair%20in%20%28%22"
                + us_code + country_04_code + "%22%29&format=json&env=store:"
                        + "//datatables.org/alltableswithkeys");
        URL url_rate_05 = new URL("http://query.yahooapis.com/v1/public/yql?q"
                + "=select%20*%20from%20yahoo.finance.xchange%20where%20pair%20in%20%28%22"
                + us_code + country_05_code + "%22%29&format=json&env=store:"
                        + "//datatables.org/alltableswithkeys");
       
        InputStream is_01 = url_rate_01.openStream();
        JsonParser parser_01 = Json.createParser(is_01);

        while (parser_01.hasNext()) {

        Event e = parser_01.next();

        if (e == Event.KEY_NAME) {

            switch (parser_01.getString()) {

            case element_02:
                parser_01.next();
               
                double eur_rate = Double.parseDouble(parser_01.getString());
               
                item_01_eur_price = item_01_usd_price * eur_rate;
                item_02_eur_price = item_02_usd_price * eur_rate;
                item_03_eur_price = item_03_usd_price * eur_rate;
                item_04_eur_price = item_04_usd_price * eur_rate;
                item_05_eur_price = item_05_usd_price * eur_rate;
               
            break;

            } // switch
        } // if
    } // while
       
        InputStream is_02 = url_rate_02.openStream();
        JsonParser parser_02 = Json.createParser(is_02);

        while (parser_02.hasNext()) {

        Event e = parser_02.next();

        if (e == Event.KEY_NAME) {

            switch (parser_02.getString()) {

            case element_02:
                parser_02.next();
               
                double cny_rate = Double.parseDouble(parser_02.getString());
               
                item_01_cny_price = item_01_usd_price * cny_rate;
                item_02_cny_price = item_02_usd_price * cny_rate;
                item_03_cny_price = item_03_usd_price * cny_rate;
                item_04_cny_price = item_04_usd_price * cny_rate;
                item_05_cny_price = item_05_usd_price * cny_rate;
               
            break;

            } // switch
        } // if
    } // while
       
        InputStream is_03 = url_rate_03.openStream();
        JsonParser parser_03 = Json.createParser(is_03);

        while (parser_03.hasNext()) {

        Event e = parser_03.next();

        if (e == Event.KEY_NAME) {

            switch (parser_03.getString()) {

            case element_02:
                parser_03.next();
               
                double gbp_rate = Double.parseDouble(parser_03.getString());
               
                item_01_gbp_price = item_01_usd_price * gbp_rate;
                item_02_gbp_price = item_02_usd_price * gbp_rate;
                item_03_gbp_price = item_03_usd_price * gbp_rate;
                item_04_gbp_price = item_04_usd_price * gbp_rate;
                item_05_gbp_price = item_05_usd_price * gbp_rate;
               
            break;

            } // switch
        } // if
    } // while
       
        InputStream is_04 = url_rate_04.openStream();
        JsonParser parser_04 = Json.createParser(is_04);

        while (parser_04.hasNext()) {

        Event e = parser_04.next();

        if (e == Event.KEY_NAME) {

            switch (parser_04.getString()) {

            case element_02:
                parser_04.next();
               
                double uah_rate = Double.parseDouble(parser_04.getString());
               
                item_01_uah_price = item_01_usd_price * uah_rate;
                item_02_uah_price = item_02_usd_price * uah_rate;
                item_03_uah_price = item_03_usd_price * uah_rate;
                item_04_uah_price = item_04_usd_price * uah_rate;
                item_05_uah_price = item_05_usd_price * uah_rate;
               
            break;

            } // switch
        } // if
    } // while
       
        InputStream is_05 = url_rate_05.openStream();
        JsonParser parser_05 = Json.createParser(is_05);

        while (parser_05.hasNext()) {

        Event e = parser_05.next();

        if (e == Event.KEY_NAME) {

            switch (parser_05.getString()) {

            case element_02:
                parser_05.next();
               
                double rub_rate = Double.parseDouble(parser_05.getString());
               
                item_01_rub_price = item_01_usd_price * rub_rate;
                item_02_rub_price = item_02_usd_price * rub_rate;
                item_03_rub_price = item_03_usd_price * rub_rate;
                item_04_rub_price = item_04_usd_price * rub_rate;
                item_05_rub_price = item_05_usd_price * rub_rate;
               
            break;

            } // switch
        } // if
    } // while
       
        DecimalFormat decformat = new DecimalFormat("#.##");
       
        System.out.println("Item_01: " + item_01_name + "; US Price: " + item_01_usd_price + "; Country: " + country_01_name + "; Local Price: " + decformat.format(item_01_eur_price));
        System.out.println("Item_01: " + item_01_name + "; US Price: " + item_01_usd_price + "; Country: " + country_02_name + "; Local Price: " + decformat.format(item_01_cny_price));
        System.out.println("Item_01: " + item_01_name + "; US Price: " + item_01_usd_price + "; Country: " + country_03_name + "; Local Price: " + decformat.format(item_01_gbp_price));
        System.out.println("Item_01: " + item_01_name + "; US Price: " + item_01_usd_price + "; Country: " + country_04_name + "; Local Price: " + decformat.format(item_01_uah_price));
        System.out.println("Item_01: " + item_01_name + "; US Price: " + item_01_usd_price + "; Country: " + country_05_name + "; Local Price: " + decformat.format(item_01_rub_price));
       
        System.out.println("********************************************************************************************************************************************");
       
        System.out.println("Item_02: " + item_02_name + "; US Price: " + item_02_usd_price + "; Country: " + country_01_name + "; Local Price: " + decformat.format(item_02_eur_price));
        System.out.println("Item_02: " + item_02_name + "; US Price: " + item_02_usd_price + "; Country: " + country_02_name + "; Local Price: " + decformat.format(item_02_cny_price));
        System.out.println("Item_02: " + item_02_name + "; US Price: " + item_02_usd_price + "; Country: " + country_03_name + "; Local Price: " + decformat.format(item_02_gbp_price));
        System.out.println("Item_02: " + item_02_name + "; US Price: " + item_02_usd_price + "; Country: " + country_04_name + "; Local Price: " + decformat.format(item_02_uah_price));
        System.out.println("Item_02: " + item_02_name + "; US Price: " + item_02_usd_price + "; Country: " + country_05_name + "; Local Price: " + decformat.format(item_02_rub_price));
       
        System.out.println("********************************************************************************************************************************************");
       
        System.out.println("Item_03: " + item_03_name + "; US Price: " + item_03_usd_price + "; Country: " + country_01_name + "; Local Price: " + decformat.format(item_03_eur_price));
        System.out.println("Item_03: " + item_03_name + "; US Price: " + item_03_usd_price + "; Country: " + country_02_name + "; Local Price: " + decformat.format(item_03_cny_price));
        System.out.println("Item_03: " + item_03_name + "; US Price: " + item_03_usd_price + "; Country: " + country_03_name + "; Local Price: " + decformat.format(item_03_gbp_price));
        System.out.println("Item_03: " + item_03_name + "; US Price: " + item_03_usd_price + "; Country: " + country_04_name + "; Local Price: " + decformat.format(item_03_uah_price));
        System.out.println("Item_03: " + item_03_name + "; US Price: " + item_03_usd_price + "; Country: " + country_05_name + "; Local Price: " + decformat.format(item_03_rub_price));
   
        System.out.println("********************************************************************************************************************************************");
       
        System.out.println("Item_04: " + item_04_name + "; US Price: " + item_04_usd_price + "; Country: " + country_01_name + "; Local Price: " + decformat.format(item_04_eur_price));
        System.out.println("Item_04: " + item_04_name + "; US Price: " + item_04_usd_price + "; Country: " + country_02_name + "; Local Price: " + decformat.format(item_04_cny_price));
        System.out.println("Item_04: " + item_04_name + "; US Price: " + item_04_usd_price + "; Country: " + country_03_name + "; Local Price: " + decformat.format(item_04_gbp_price));
        System.out.println("Item_04: " + item_04_name + "; US Price: " + item_04_usd_price + "; Country: " + country_04_name + "; Local Price: " + decformat.format(item_04_uah_price));
        System.out.println("Item_04: " + item_04_name + "; US Price: " + item_04_usd_price + "; Country: " + country_05_name + "; Local Price: " + decformat.format(item_04_rub_price));
   
        System.out.println("********************************************************************************************************************************************");
       
        System.out.println("Item_05: " + item_05_name + "; US Price: " + item_05_usd_price + "; Country: " + country_01_name + "; Local Price: " + decformat.format(item_05_eur_price));
        System.out.println("Item_05: " + item_05_name + "; US Price: " + item_05_usd_price + "; Country: " + country_02_name + "; Local Price: " + decformat.format(item_05_cny_price));
        System.out.println("Item_05: " + item_05_name + "; US Price: " + item_05_usd_price + "; Country: " + country_03_name + "; Local Price: " + decformat.format(item_05_gbp_price));
        System.out.println("Item_05: " + item_05_name + "; US Price: " + item_05_usd_price + "; Country: " + country_04_name + "; Local Price: " + decformat.format(item_05_uah_price));
        System.out.println("Item_05: " + item_05_name + "; US Price: " + item_05_usd_price + "; Country: " + country_05_name + "; Local Price: " + decformat.format(item_05_rub_price));
   
    } // main method
} // class

