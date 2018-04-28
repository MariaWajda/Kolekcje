package Files;

import com.oracle.tools.packager.IOUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReadFile {
    private File mainfile;

    public ReadFile (String pathFile){
        mainfile = new File(pathFile);
    }

    public String readFile () throws IOException {
        FileInputStream fileInputStream = new FileInputStream(mainfile.getAbsoluteFile());
            StringBuilder stringBuilder = new StringBuilder();

            int read;
            while ((read = fileInputStream.read()) != -1){
                stringBuilder.append((char) read);
            } return stringBuilder.toString();
        }

        public int countHrefOnWebsite (String website) throws IOException{
        int count = 0;

            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(website).openConnection();
            InputStream inputStream = httpURLConnection.getInputStream();
            StringBuilder stringBuilder = new StringBuilder();

            int read;
            while ( (read=inputStream.read()) != -1){
                stringBuilder.append((char)read);
            }

            Pattern patternHref = Pattern.compile("href=");
            Matcher matcher = patternHref.matcher(stringBuilder.toString());

            while (matcher.find()){
                count++;
            }

        return count;
        }
    }

