# 🎵 TuneUp — Fullstack Music App

**Backend:** Java + Spring Boot  
**Frontend:** React + Typescript + Vite  
**Databases:** PostgreSQL, Redis  
**Environment:** Docker + Docker Compose

---

## 🖥️ Requirements

- [Docker](https://www.docker.com/products/docker-desktop)
- [Docker Compose](https://docs.docker.com/compose/)
- (Optional) Git

---

## 🚀 Getting Started

1. **Clone the repository:**

```bash
git clone https://github.com/your-name/TuneUp.git
cd TuneUp
```

2. **Run the application:**

```bash
docker-compose up --build
```

> ⚙️ All required `.env` variables and configuration files are already provided in the repository to simplify the first run.

4. ✅ Once everything is running, open in your browser:

| Service     | URL                             |
|-------------|----------------------------------|
| 🌐 Frontend | http://localhost:3000            |
| 🛠️ Backend  | http://localhost:8080            |
| 🐘 pgAdmin  | http://localhost:9090            |
| 🧠 Redis    | redis://localhost:6379 (internal) |

> **pgAdmin login:**
> - Email: `admin@example.com`
> - Password: `admin`

---

## ⚙️ Project Structure

```
TuneUp/
├── backend/            # Spring Boot Backend
│   └── Dockerfile
├── frontend/           # React + Vite Frontend
│   └── Dockerfile
├── docker-compose.yml  # Docker Compose configuration
├── .env                # Environment variables (included for demo)
└── application.yml     # Spring config (safe version provided)
```

---

## 🧹 Useful Commands

| Command                     | Description                     |
|----------------------------|---------------------------------|
| `docker-compose down`      | Stop all containers             |
| `docker-compose down -v`   | Stop and remove all volumes     |
| `docker-compose logs -f`   | View live logs                  |
| `docker exec -it spring_tuneup sh` | Access backend container |

---

## 🔐 Security Notes

- Do not commit real credentials or tokens to public repositories.
- Use `${ENV}` variables in `application.yml` and manage secrets securely.
- The included `.env` and config files are for **local development only**.

Enjoy building with TuneUp! 🎸