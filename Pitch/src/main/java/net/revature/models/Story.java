package net.revature.models;


import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Story {
	private long pitch_id;
	private long author_id;
	private long genre_id;
	private String title;
	private String blurb;
	private String description;
	private List<Story> stories;

	public Story() {
		pitch_id=123456;
		author_id=12345;
		genre_id=73648;
		title="My First Story Pitch";
		blurb="My Story blurb";
		description="My story description";
		stories=new ArrayList<>();			

	}

	public long getPitch_id() {
		return pitch_id;
	}

	public void setPitch_id(long pitch_id) {
		this.pitch_id = pitch_id;
	}

	public long getAuthor_id() {
		return author_id;
	}

	public void setAuthor_id(long author_id) {
		this.author_id = author_id;
	}

	public long getGenre_id() {
		return genre_id;
	}

	public void setGenre_id(long genre_id) {
		this.genre_id = genre_id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBlurb() {
		return blurb;
	}

	public void setBlurb(String blurb) {
		this.blurb = blurb;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<Story> getStories() {
		return stories;
	}

	public void setStories(List<Story> stories) {
		this.stories = stories;
	}

	@Override
	public int hashCode() {
		return Objects.hash(author_id, blurb, description, genre_id, pitch_id, stories, title);
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
		return author_id == other.author_id && Objects.equals(blurb, other.blurb)
				&& Objects.equals(description, other.description) && genre_id == other.genre_id
				&& pitch_id == other.pitch_id && Objects.equals(stories, other.stories)
				&& Objects.equals(title, other.title);
	}

	@Override
	public String toString() {
		return "Story [pitch_id=" + pitch_id + ", author_id=" + author_id + ", genre_id=" + genre_id
				+ ", tentative_title=" +title + ", blurb=" + blurb + ", description=" + description
				+ ", stories=" + stories + "]";
	}
	

}
