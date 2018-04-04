//package ch14_Multithreading;
//
//public class SynchronizationTest {
//	public Shared sharedObject = new Shared();
//	private static class DemoThread1 extends Thread {
//		public void run() {
//			//this is making sure that only this thread is accessing sharedObject when it it running.
//			synchronized (sharedObject) {
//				sharedObject.sorting();
//			}
//		}
//	}
//	static class DemoThread2 extends Thread {
//		public void run() {
//			synchronized (sharedObject) {
//				sharedObject.printing();
//			}
//		}
//	}
//	public static void main(String[] args) {
//		new DemoThread1.run();
//		new DemoThread2.run();
//	}
//}
