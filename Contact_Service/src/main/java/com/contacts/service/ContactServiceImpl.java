package com.contacts.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.contacts.entity.Contact;

@Service
public class ContactServiceImpl implements ContactService {

	List<Contact> list = List.of(new Contact(1L, "somesh6g@gmail.com", "Sant", 1311L),
			new Contact(2L, "anil6g@gmail.com", "Anil", 1311L), new Contact(3L, "sameer6g@gmail.com", "Sameer", 1312L));

	public List<Contact> getContactsOfUser(Long userId) {
		List<Contact> collect = list.stream().filter(i -> i.getUserId().equals(userId)).collect(Collectors.toList());
		return collect;
	}

}
