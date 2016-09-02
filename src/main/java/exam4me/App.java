package exam4me;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Hello world!
 **/

@Configuration
@EnableAutoConfiguration
@ComponentScan
public class App
{
    public static void main( String[] args )
    {
        SpringApplication.run(App.class, args);
    }
}

/*

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class App {

    FileReader fileReader;
    BufferedReader bufferedReader;

    FileWriter fileWriter;
    BufferedWriter bw;

    public App() throws Exception{

        */
/* File to read *//*

        fileReader  = new FileReader("isyb.csv");
        bufferedReader = new BufferedReader(fileReader);

        */
/* File to write *//*

        fileWriter = new FileWriter("isya.sql", true);
        bw = new BufferedWriter(fileWriter);
    }

    public void process() throws Exception
    {
        for(String line; (line = bufferedReader.readLine()) != null; ) {
            String[] details = {"pending", "pending", "pending", "pending"};

            bw.write("INSERT INTO isya VALUES('" + line.split(",")[0] +
                    "', '" + details[0] +
                    "', '" + details[1] +
                    "', '" + details[2] +
                    "', '" + details[3] + "');\r\n");
        }

        bw.close();
        bufferedReader.close();
    }

    public static void main(String[] args) {
        try {
            App app = new App();
            app.process();
        }
        catch(Exception ex)
        {
            System.out.println(ex.getMessage());
        }
    }

}
*/
