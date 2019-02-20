package queues;

import java.util.concurrent.LinkedBlockingQueue;

public class QueuesPractice
{
	public static void main(String[] args)
	{
		LinkedBlockingQueue<String> line = new LinkedBlockingQueue<String>();
		
		//add a few elements
		line.offer("susie");
		line.offer("juan");
		
		System.out.println(line.peek());
		System.out.println(line.poll());
		
		line.offer("jeremy");
		line.offer("tyler");
		
		System.out.println(line.peek());
		System.out.println(line.poll());
		
		line.offer("todd");
		
		System.out.println(line.peek());
		
		System.out.println(line.poll());
		System.out.println(line.poll());
		System.out.println(line.poll());
		System.out.println(line.poll());
		System.out.println(line.poll());
		System.out.println(line.poll());
	}
	
	private static void introToQueues()
	{
		//create a queue object (there are plenty of classes to choose from)
		LinkedBlockingQueue<String> line = new LinkedBlockingQueue<String>();
		
		//add a few elements
		line.offer("susie");
		line.offer("juan");
		line.offer("jeremy");
		line.offer("tyler");
		
		//remove and print them
		while (!line.isEmpty())
		{
			String first = line.poll();
			System.out.println(first);
		}
	}
}
