package trainer;

import java.io.FileInputStream;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;

public class addTrainer {
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		try {
            // Replace "path/to/your/service-account.json" with the actual path
            FirebaseOptions options = new FirebaseOptions.Builder().setCredentials(GoogleCredentials.fromStream(new FileInputStream("path/to/your/service-account.json"))).setDatabaseUrl("https://your-firebase-project-id.firebaseio.com/").build();

            FirebaseApp.initializeApp(options);
        } catch (Exception e) {
            e.printStackTrace();
        }
		
	}

}
