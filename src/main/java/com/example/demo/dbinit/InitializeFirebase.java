package com.example.demo.dbinit;

import java.io.FileInputStream;
import java.io.IOException;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;

@Service
public class InitializeFirebase {

	@PostConstruct
	public void initializeFirebase() throws IOException {
		
		FileInputStream serviceAccount =
		  new FileInputStream("./insert-student-demo-firebase-adminsdk-6es8s-e45b95d375.json");
		
		FirebaseOptions options = new FirebaseOptions.Builder()
		  .setCredentials(GoogleCredentials.fromStream(serviceAccount))
		  .setDatabaseUrl("https://insert-student-demo.firebaseio.com")
		  .build();
		
		FirebaseApp.initializeApp(options);

	}
}
