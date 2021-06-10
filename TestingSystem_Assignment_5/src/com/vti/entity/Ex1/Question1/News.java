package com.vti.entity.Ex1.Question1;

public class News implements INews {
		int ID;
		String title;
		String publicDate;
		String Author;
		String Content;
		int[] rates;
		float	averageRate;
		public int getID() {
			return ID;
		}
		public void setID(int iD) {
			ID = iD;
		}
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public String getPublicDate() {
			return publicDate;
		}
		public void setPublicDate(String publicDate) {
			this.publicDate = publicDate;
		}
		public String getAuthor() {
			return Author;
		}
		public void setAuthor(String author) {
			Author = author;
		}
		public String getContent() {
			return Content;
		}
		public void setContent(String content) {
			Content = content;
		}
		public float getAverageRate() {
			return averageRate;
		}
		
		@Override
		public void Display() {
			System.out.println("News [title=" + title + ", publicDate=" + publicDate + ", Author=" + Author + ", Content=" + Content
					+ "]");
			
			
		}
		
		float temp = 0f;
		@Override
		public float Calculate() {
			for(int i = 0; i <= 2; i++) {
				temp = temp + rates[i];
			}
			return temp / 3;
		}
		public void setRates(int[] rates) {
			this.rates = rates;
		}
		@Override
		public String toString() {
			return "News [title=" + title + ", publicDate=" + publicDate + ", Author=" + Author + ", Content=" + Content
					+ "]";
		}
		
}
