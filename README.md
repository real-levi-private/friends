## 1. Run Developer mode with local Front and Backend

### 1.1 Run docker compose

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

#### 3. some documentation

##### How to create self-signed ssl-certificate:

create private key:

```bash
$ openssl genrsa -out ./nginx/certs/selfsigned.key 2048
```

create and sign certificate:

```bash
$ openssl req -new -x509 -key ./nginx/certs/selfsigned.key -out ./nginx/certs/selfsigned.crt -days 365
```
