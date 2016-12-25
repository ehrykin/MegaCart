package com.megacart.util;

public class Pagination {
	private int total = 0;
	private int page = 1;
	private int limit = 20;
	private int numLinks = 8;
	private String url = "";
	private String textFirst = "|&lt;";
	private String textLast = "&gt;|";
	private String textNext = "&gt;";
	private String textPrev = "&lt;";
	
	public Pagination setTotal(int total) {
		this.total = total;
		return this;
	}
	
	public Pagination setPage(int page) {
		this.page = page;
		return this;
	}

	public Pagination setLimit(int limit) {
		this.limit = limit;
		return this;
	}

	public Pagination setNumLinks(int numLinks) {
		this.numLinks = numLinks;
		return this;
	}

	public Pagination setUrl(String url) {
		this.url = url;
		return this;
	}

	public Pagination setTextFirst(String textFirst) {
		this.textFirst = textFirst;
		return this;
	}

	public Pagination setTextLast(String textLast) {
		this.textLast = textLast;
		return this;
	}

	public Pagination setTextNext(String textNext) {
		this.textNext = textNext;
		return this;
	}

	public Pagination setTextPrev(String textPrev) {
		this.textPrev = textPrev;
		return this;
	}

	public String render() {		
		
		StringBuilder sb = new StringBuilder();
		
		if (page < 1)
			page = 1;

		if (limit < 1)
			limit = 20;

		int numPages = (int) Math.ceil(total / limit);

		url = url.replace("%7Bpage%7D", "{page}");

		sb.append("<ul class='pagination'>");

		if (page > 1) {
			sb.append("<li><a href='");
			sb.append(url.replace("&amp;page={page}", "").replace("&page={page}", "").replace("?page={page}", ""));
			sb.append("'>").append(textFirst).append("</a></li>");
			
			if (page == 2) {
				sb.append("<li><a href='");
				sb.append(url.replace("&amp;page={page}", "").replace("&page={page}", "").replace("?page={page}", ""));
				sb.append("'>").append(textPrev).append("</a></li>");
			} else {
				sb.append("<li><a href='");
				sb.append(url.replace("{page}", String.valueOf(page - 1))).append("'>").append(textPrev).append("</a></li>");
			}
		}

		if (numPages > 1) {
			int start = 1;
			int end = numPages;
			
			if (numPages > numLinks) {
				start = page - (int) Math.floor(numLinks / 2);
				end = page + (int) Math.floor(numLinks / 2);

				if (start < 1) {
					end += Math.abs(start) + 1;
					start = 1;
				}

				if (end > numPages) {
					start -= (end - numPages);
					end = numPages;
				}
			}

			for (int i = start; i <= end; i++) {
				if (page == i) {
					sb.append("<li class='active'><span>").append(i).append("</span></li>");
				} else {
					if(i == 1)
						sb.append("<li><a href='").append(url.replace("&amp;page={page}", "").replace("&page={page}", "").replace("?page={page}", ""))
							.append("'>").append(i).append("</a></li>");
					else
						sb.append("<li><a href='").append(url.replace("{page}", String.valueOf(i))).append("'>").append(i).append("</a></li>");
				}
			}
		}

		if (page < numPages) {
			sb.append("<li><a href='").append(url.replace("{page}", String.valueOf(page + 1))).append("'>").append(textNext).append("</a></li>");
			sb.append("<li><a href='").append(url.replace("{page}", String.valueOf(numPages))).append("'>").append(textLast).append("</a></li>");
		}

		sb.append("</ul>");

		String result = "";
		
		if (numPages > 1)
			result = sb.toString();
			
		return result;
	}
}
