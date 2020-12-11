package com.stackroute.keepnote.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import com.stackroute.keepnote.model.Note;


/*
 * This class contains the code for data storage interactions and methods 
 * of this class will be used by other parts of the applications such
 * as Controllers and Test Cases
 * */

public class NoteRepository {

	/* Declare a variable called "list" to store all the notes. */
	Connection con = null;

	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

	public NoteRepository() throws Exception {

		if (con == null) {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
		}

		/* Initialize the variable using proper data type */
	}

	/* This method should return all the notes in the list */

	public List<Note> getList() throws Exception {
		PreparedStatement ps = con.prepareStatement("select * from  note");
		ResultSet rs = ps.executeQuery();
		List<Note> ls = new ArrayList<Note>();

		while (rs.next()) {
			Note ob = new Note();
			ob.setNoteId(rs.getString(1));
			ob.setNoteTitle(rs.getString(2));
			ob.setNoteContent(rs.getString(3));
			ob.setNoteStatus(rs.getString(4));
			ob.setCreatedAt(rs.getString(5));
			ls.add(ob);
		}
		return ls;
	}

	/* This method should set the list variable with new list of notes */

	public void setList(List<Note> list) {

	}

	/*
	 * This method should Note object as argument and add the new note object into
	 * list
	 */

	public void addNote(Note note)throws Exception {
		PreparedStatement ps=con.prepareStatement("insert into note values(?,?,?,?,?)");
		ps.setString(1, note.getNoteId());
		ps.setString(2, note.getNoteTitle());
		ps.setString(3, note.getNoteContent());
		ps.setString(4, note.getNoteStatus());
		ps.setString(5, note.getNoteContent());
		ps.executeUpdate();
	}

	/* This method should deleted a specified note from the list */

	public boolean deleteNote(int noteId) {
		/* Use list iterator to find matching note id and remove it from the list */
		return false;

	}

	/* This method should return the list of notes */

	public List<Note> getAllNotes() {
		return null;
	}

	/*
	 * This method should check if the matching note id present in the list or not.
	 * Return true if note id exists in the list or return false if note id does not
	 * exists in the list
	 */

	public boolean exists(int noteId) {
		return false;
	}
}