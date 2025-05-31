package com.HealthBite.authService.dto;

import java.util.List;

public class PaginatedUserResponseDto {

	private List<UserResponseDto> users;
    private int page;
    private int size;
    private long totalElements;
    private int totalPages;
	public List<UserResponseDto> getUsers() {
		return users;
	}
	public void setUsers(List<UserResponseDto> users) {
		this.users = users;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public long getTotalElements() {
		return totalElements;
	}
	public void setTotalElements(long totalElements) {
		this.totalElements = totalElements;
	}
	public int getTotalPages() {
		return totalPages;
	}
	public void setTotalPages(int totalPages) {
		this.totalPages = totalPages;
	}
    
	
}
