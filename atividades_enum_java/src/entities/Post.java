package entities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Post {

	public static DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

	private LocalDateTime moment;
	private String title, content;
	private Integer likes;

	private List<Comment> comments = new ArrayList<>();

	public Post(LocalDateTime moment, String title, String content, Integer likes) {
		this.moment = moment;
		this.title = title;
		this.content = content;
		this.likes = likes;
	}

	public void addComment(Comment comment) {
		this.comments.add(comment);
	}

	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append(title + "\n");
		sb.append(likes);
		sb.append(" Likes - " );
		sb.append(fmt.format(moment) + "\n");
		sb.append(content + "\n");
		sb.append("Comments: \n");
		for (Comment c : comments) {
			sb.append(c.getText() + "\n");
		}
				
		return sb.toString();		
	}
}
