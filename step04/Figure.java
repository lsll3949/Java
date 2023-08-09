package step04;

public class Figure {
		// 멤버 변수
		String fig; // 도형이름 저장 변수
		int w, h, area; // 가로, 세로, 넓이 저장 변수
		
		// 메서드
		void setFig(String fig, int w, int h){
			this.fig = fig;
			this.w = w;
			this.h = h;
		}
		
		int getArea() { // 사각형/삼각형 넓이 구하기
			/*if (fig.equals("rect")) return w*h;
			if (fig.equals("tri")) return w*h/2;
			return area;
			*/
			//this.area = (fig.equals("rect"))?(w*h):(w*h/2);
			
			if(fig == "rect") {
				area = w*h;
			} else {
				area = w*h/2;
			}			
			return area;
		}
		
		String getFig() { // 도형이름 반환
			return this.fig;
		}
		
		int getW() { // 가로길이 반환
			return w;
		}
	
		int getH() { // 세로길이 반환
			return h;
		}
		
		String getString(){ // OOO 입니다. 반환
			return this.fig + "의 가로 길이" +this.w+ "의 세로길이" +this.h+ "\n넓이: "+getArea();
		}
	public static void main(String[] args) {
		Figure ob1 = new Figure();
		ob1.setFig("tri", 5, 6);
		System.out.println(ob1.getString());
		
		Figure ob2 = new Figure();
		ob2.setFig("rect", 5, 6);
		System.out.println(ob2.getString());
		
	}

}
