package com.vti.backend;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.vti.entity.Ex1.Question1.INews;
import com.vti.entity.Ex1.Question1.News;

public class Excercise1_Question1 {
	private List<News> New1;

	public Excercise1_Question1() {
		New1 = new ArrayList<>();
	}

	public void Insertnews() {
		News news = new News();
		int[] rates = new int[3];

		Scanner scanner = new Scanner(System.in);

		System.out.println("Nhập Title: ");
		news.setTitle(scanner.nextLine());

		System.out.println("Nhập Publish Date: ");
		news.setPublicDate(scanner.nextLine());

		System.out.println("Nhập Author: ");
		news.setAuthor(scanner.nextLine());

		System.out.println("Nhập Content: ");
		news.setContent(scanner.nextLine());

		System.out.println("Nhập 3 đánh giá: ");
		for (int i = 0; i < 3; i++) {
			System.out.println("Đánh giá " + (i + 1) + ": ");
			rates[i] = scanner.nextInt();
		}
		news.setRates(rates);
		New1.add(news);
		
	}

	public void Viewlistnews() {
		for (News news : New1) {
			news.Display();
		}
	}
	

	public void Averagerate() {
		for (News news : New1) {
			System.out.println("Title: " + news.getTitle() + " / Average Rate: " + news.Calculate());
		}
	}
	

	public void Exit() {
		System.out.println("Đã Thoát!");
	}
}