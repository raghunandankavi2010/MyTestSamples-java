/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TranslateTest;
import com.google.api.GoogleAPI;
import com.google.api.GoogleAPIException;
import com.google.api.translate.Language;
import com.google.api.translate.Translate;
import java.io.UnsupportedEncodingException;
import org.json.JSONException;
import org.json.JSONObject;


/**
 *
 * @author Raghunandan
 */
public class Testtanslate {
    public static void main(String args[]) throws GoogleAPIException, JSONException, UnsupportedEncodingException
    {
    GoogleAPI.setHttpReferrer("http://www.google.com");


    // Set the Google Translate API key
    // See: http://code.google.com/apis/language/translate/v2/getting_started.html
    GoogleAPI.setKey("AIzaSyDhxKrCuUyF_1Qj7DzVxaFh-Fxa_-VBDEY");

    String json = Translate.DEFAULT.execute("Hello",Language.ENGLISH, Language.HINDI);

    String output= new String(json.getBytes(), "UTF-8");
    //JSONObject jb = new JSONObject(json);
    System.out.println("jb"+output);
}

}
