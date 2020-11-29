package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.model.Student;
import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.WriteResult;
import com.google.firebase.cloud.FirestoreClient;

@Service
public class StudentService {

	public static void saveStudent(Student student) {
		Firestore dbFirestore = FirestoreClient.getFirestore();
		ApiFuture<WriteResult> future = dbFirestore.collection("beginner").document(student.getId()).set(student);
		
	}
}
