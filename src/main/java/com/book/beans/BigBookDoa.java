package com.book.beans;

import java.util.List;
import com.book.model.BigBookTable;

public interface BigBookDoa {
	 public void addbook(BigBookTable book);
	 public List<BigBookTable> getBookList();
}
