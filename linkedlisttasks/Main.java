package linkedlisttasks;

public class Main {

	public static void main(String[] args) {
		LinkedListSong list = new LinkedListSong();
		System.out.println(list);
		
		list.add(new Song("Song1", "Artist1", 2000, Song.POP));
		list.add(new Song("Song2", "Artist2", 2001, Song.ROCK));
		System.out.println(list);
		
		Song s = new Song("Song3", "Artist3", 2002, Song.COUNTRY);
		list.add(s);
		System.out.println(list);
		list.remove(0);
		System.out.println(list);
		
		System.out.println(list.size());
		list.clear();
		System.out.println(list.size());
	}

}
