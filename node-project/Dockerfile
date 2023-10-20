# 사용할 Node.js 이미지
FROM node:20

# 작업 디렉토리 설정
WORKDIR /app

# 앱 종속성 설치
COPY package*.json ./
RUN npm install

# 소스 코드 복사
COPY . .

# 어플리케이션 실행 명령어
CMD [ "npm", "start" ]