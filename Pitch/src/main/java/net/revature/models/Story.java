package net.revature.models;


import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Story {
    private int id; 
	private String author; 
	private String editor; 
	private String genre;
	private String title;
	private String description;
	private int storyLength; 
	private List<Story> stories;

	public Story() {
	    author= "author";
	    editor="editor";
	    genre="my genre";
		title="My First Story Pitch";
		description="My story description";
		storyLength= 123;
		stories=new ArrayList<>();			
}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getEditor() {
		return editor;
	}

	public void setEditor(String editor) {
		this.editor = editor;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getStoryLength() {
		return storyLength;
	}

	public void setStoryLength(int storyLength) {
		this.storyLength = storyLength;
	}

	public List<Story> getStories() {
		return stories;
	}

	public void setStories(List<Story> stories) {
		this.stories = stories;
	}

	@Override
	public int hashCode() {
		return Objects.hash(author, description, editor, genre, id, stories, storyLength, title);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Story other = (Story) obj;
		return Objects.equals(author, other.author) && Objects.equals(description, other.description)
				&& Objects.equals(editor, other.editor)
				&& Objects.equals(genre, other.genre) && id == other.id && Objects.equals(stories, other.stories)
				&& storyLength == other.storyLength && Objects.equals(title, other.title);
	}

	@Override
	public String toString() {
		return "Story [id=" + id + ", author=" + author + ", editor=" + editor + ", genre=" + genre + ", title=" + title
				+ ", description=" + description + ", storyLength="
				+ storyLength + ", stories=" + stories + "]";
	}

	
	
}


	

	