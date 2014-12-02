package com.example.feeds;

import static org.junit.Assert.*;

import org.junit.Test;

import com.sun.syndication.io.FeedException;

public class FeedsServiceTest {

	FeedsService service = new FeedsService();
	
	@Test
	public void shouldParseFeeds() throws IllegalArgumentException, FeedException {
		final String feeds = "<?xml version=\"1.0\" encoding=\"UTF-8\" ?>" +
"<rss version=\"2.0\">" +
"<channel>" +
"  <title>W3Schools Home Page</title>" +
"  <link>http://www.w3schools.com</link>" +
"  <description>Free web building tutorials</description>" +
"  <item>" +
"    <title>RSS Tutorial</title>" +
"    <link>http://www.w3schools.com/rss</link>" +
"    <description>New RSS tutorial on W3Schools</description>" +
"  </item>" +
"  <item>" +
"    <title>XML Tutorial</title>" +
"    <link>http://www.w3schools.com/xml</link>" +
"    <description>New XML tutorial on W3Schools</description>" +
"  </item>" +
"</channel>" +
"</rss> ";
		
		String title = service.parseFeed(feeds);
		assertEquals("W3Schools Home Page", title);		
	}
}
