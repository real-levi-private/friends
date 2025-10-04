## 1. Run Developer mode with local Front and Backend
###  1.1 Run docker compose 

```bash
docker compose -f docker-compose-front-and-backend-dev.yml up
```

### 1.2 Run Backend Locally


make sure .env in friends-backend/friends-backend is correctly setup

```bash
cd friends-backend/friends-backend
export $(grep -v '^#' .env | xargs)   # Linux/macOS
./mvnw spring-boot:run
```

### 1.3 Run Frontend Locally

```bash
cd friends-frontend
npm install
npm run serve
```

## 2. Run Full Docker Compose version
### 2.1 Run docker compose 

```bash
docker compose up
```
