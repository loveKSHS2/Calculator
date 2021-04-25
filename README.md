<h3 id="-">팀프로젝트</h3>
<hr>
<h4 id="2021-04-24-">2021.04.24 작성자: 김승현</h4>
<h2 id="1-">1. 요구사항 분석</h2>
<ul>
<li>공학용 계산기 개발</li>
<li>android application 이용</li>
</ul>
<h2 id="2-">2. 구조 설계</h2>
<ul>
<li><p>UML Diagram</p>
<ul>
<li><p>Use Case Diagram</p>
<p> <img src="https://user-images.githubusercontent.com/45482747/115950641-74f55c80-a517-11eb-9ea7-771ba0c7f4e1.png" width="700" height="500"></p>
</li>
<li><p>Sequence Diagram</p>
<p><img src="https://user-images.githubusercontent.com/45482747/115951565-58a7ee80-a51c-11eb-803d-894832267660.jpg"  width="700" height="500"></p>
</li>
<li><p>Class Diagram</p>
<p><img src="https://user-images.githubusercontent.com/45482747/115951590-7412f980-a51c-11eb-9c7d-18b75ae02279.png" width="700" height="500"></p>
</li>
</ul>
</li>
<li><p>클래스 생성</p>
<ul>
<li><p>InputOutput 클래스</p>
<ul>
<li><p>MainActivity 클래스로부터 전달받은 Infix식을 stack을 통해 postfix로 변환, 변환된 식을 Operation클래스에 전달하고 그 결과값을 MainActivity 클래스에 다시 전달하는 클래스</p>
</li>
<li><p>expression 메소드 :  전달받은 입력한 식을 Infix -&gt; postfix 변환 계산을 위해 operator메소드를 call, 결과값을 MainActivity클래스에 전달 </p>
</li>
<li><p>operator 메소드 : expression 메소드를 통해 호출받는 메소드, 계산은 operator클래스의 메소드를 통해 실행, 결과값을 expression 메소드에 리턴 </p>
</li>
<li><p>isNumber 메소드 : 전달받은 temp(string)이 숫자이면 true, 문자이면 false를 전달, expression 메소드에서 call</p>
</li>
<li><p>변수:<br>stack : Stack&#60;String&#62;<br>&#40;Infix를 postfix로 변환하는데 사용&#41;  </p>
<p>stack2 : Stack&#60;String&#62;<br>&#40;변환된 식을 계산하는데 사용&#41;   </p>
<p>expList : List&#60;String&#62;<br>(postfix식을 숫자와 연산자단위로 끊어 저장하는 배열)  </p>
<p> opPriority : HashMap&#60;String, Integer&#62;<br> (연산자에 우선순위 부여) </p>
</li>
</ul>
</li>
<li><p>Operation 클래스</p>
<ul>
<li><p>InputOutput으로부터 피연산자(first,second),연산자(String)을 전달받으며 call을 받아 계산한후 결과값을 리턴하는 클래스  </p>
</li>
<li><p>plus 메소드 : 덧셈연산   </p>
</li>
<li><p>minu 메소드 : 덧셈연산  </p>
</li>
<li><p>mult 메소드 :  곱셈 연산  </p>
</li>
<li><p>div 메소드 : 나눗셈 여산</p>
</li>
<li><p>mod 메소드 : 나머지 연산</p>
</li>
<li><p>expFunction 메소드 : 지수 연산</p>
</li>
<li><p>LogFunction 메소드 : 로그 연산</p>
</li>
<li><p>RootFunction 메소드 : 루트 연산</p>
</li>
<li><p>sinFunction 메소드 : 사인함수 연산</p>
</li>
<li><p>cosFunction 메소드 : 코사인함수 연산</p>
</li>
<li><p>tanFunction 메소드 : 탄젠트함수 연산</p>
</li>
<li><p>inFunction 메소드 : 제곱 연산</p>
</li>
<li><p>factFunciton 메소드 : 팩토리얼 연산</p>
</li>
</ul>
</li>
<li><p>MainActivity 클래스</p>
<ul>
<li><p>button의 이벤트를 받고 창에 식과 결과값을 출력, History를 저장하고 그 값을 Main2Activity에 전달하는 클래스</p>
</li>
<li><p>onCreate메소드 : 버튼이벤트를 받고 창에 출력, History를 Main2Activity 클래스에 전달</p>
</li>
<li><p>변수:<br>io : InputOutput<br>(식을 계산하는데 사용, 결과값 리턴)</p>
<p>txtResult : TextView<br>(결과값 출력)</p>
<p> edtInput : EditText
 (계산식 출력)  </p>
<p> val : String 
 (입력한 연산식을 저장할 변수)  </p>
<p> result : String<br> (Main2Activity클래스에 전달할 결과값을 저장할 변수)  </p>
<p> log : String<br> (입력했던 연산식과 결과값의 history를 저장할 변수)  </p>
<p> btnNum0, btnNum1, btnNum2, btnNum3, btnNum4, btnNum5, btnNum6, btnNum7, btnNum8, btnNum9, btnRes, btnHis, btnDel, btnBracR, btnBracL, btnMod, btndivi, btnMult, btnMinu, btnPlus, btnFac, btnRoot, btnLog, btnLog, btnPow, btnExp, btnSin, btnCos, btnTan, btnDot, btnResult : Button<br> (이벤트 처리하는 버튼 객체를 저장하는 변수)  </p>
</li>
</ul>
</li>
<li><p>Main2Activity 클래스  </p>
<ul>
<li><p>변수:<br> tx : TextView<br>(History를 출력할 TextView 객체를 저장하는 변수)  </p>
<p>intent : Intent<br>(MainActivity에서 log값을 전달받는 객체를 저장하는 변수)    </p>
<p>log : String<br>(전달받은 log값을 저장하는 변수)  </p>
</li>
</ul>
</li>
</ul>
</li>
<li><p>레이아웃  </p>
<ul>
<li><p>activity_main.xml : 사용자가 보느 계산기 화면 출력. TextView, Button위젯 포함  </p>
</li>
<li><p>activity2_main.xml : 사용자가 보는 history 화면 출력. TextView 위젯 포함  </p>

</li>

</ul>

</li><h2 id="3-">3. 입력/출력 데이터 정의</h2>

<ul>

<li><p>데이터 종류:연산자(String),   피연산자(double), Button 위젯(0~9, 소수점, 연산자, reset, delete, history), 수식(String)  </p>
</li>
<li><p>입력: Button 위젯(연산자, 피연산자, reset, delete, history)  </p>
</li>
<li><p>출력: TextView 위젯(계산한 결과값: String,이전 계산한 결과값: String)  </p>
</li>
</ul>
</li>
<h2 id="4-">4. 알고리즘 설계 및 구현</h2>
<ul>
<li><p>InputOutput 클래스  </p>
<ul>
<li>expression 메소드 알고리즘</li>
<p> <img src="https://user-images.githubusercontent.com/45482747/115950641-74f55c80-a517-11eb-9ea7-771ba0c7f4e1.png" width="700" height="500"></p>
<li>operator 메소드 알고리즘</li>
<p> <img src="https://user-images.githubusercontent.com/45482747/115950641-74f55c80-a517-11eb-9ea7-771ba0c7f4e1.png" width="700" height="500"></p>
<li>isNumber 메소드 알고리즘</li>
<p> <img src="https://user-images.githubusercontent.com/45482747/115950641-74f55c80-a517-11eb-9ea7-771ba0c7f4e1.png" width="700" height="500"></p>
</ul>
</li>
</ul>
</li>
</ul>

