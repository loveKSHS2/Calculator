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
<p><img src="https://user-images.githubusercontent.com/45482747/115950641-74f55c80-a517-11eb-9ea7-771ba0c7f4e1.png" width="700" height="500"></p>
</li>
<li><p>Sequence Diagram</p> 
<p><img src="https://user-images.githubusercontent.com/45482747/115951565-58a7ee80-a51c-11eb-803d-894832267660.jpg" width="700" height="500"></p>
</li>
<li><p>Class Diagram</p> 
<p><img src="https://user-images.githubusercontent.com/45482747/115951590-7412f980-a51c-11eb-9c7d-18b75ae02279.png" width="500" height="500"></p>
</li>
</ul>
</li>
</ul>
<li><p>클래스 생성</p>
<ul>
<li><p>InputOutput 클래스</p>
<ul>
<li><p>MainActivity 클래스로부터 전달받은 Infix식을 stack을 통해 postfix로 변환, 변환된 식을 Operation클래스에 전달하고 그 결과값을 MainActivity 클래스에 다시 전달하는 클래스</p>
</li>
<li><p>expression 메소드 :  전달받은 입력한 식을 Infix -> postfix 변환 계산을 위해 operator메소드를 call, 결과값을 MainActivity클래스에 전달 </p>
</li>
<li><p>operator 메소드 : expression 메소드를 통해 호출받는 메소드, 계산은 operator클래스의 메소드를 통해 실행, 결과값을 expression 메소드에 리턴 </p>
</li>
<li><p>isNumber 메소드 : 전달받은 string이 숫자이면 true, 문자이면 false를 전달, expression 메소드에서 call  </p>
</li>
</ul>
</li>
</ul>
</li>
</ul>

  
  
  


