package suheduler;
//상담 업무가 없거나 대기열이 적은 상담원에 배분
public class LeastJob implements Scheduler {
	public void getNextCall() {
		System.out.println("상담전화 순서대로 대기열에서 가져옵니다");
	}
	public void sendCallToAgent() {
		System.out.println("현재 상담업무가 없거나 대기열이 가장 적은 상담원에 배분합니다");
	}

}
