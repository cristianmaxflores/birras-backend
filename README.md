# birras-backend
backend for meetings.birras

#docker postgres

docker pull postgres:alpine

docker run --name postgres-db -e POSTGRES_PASSWORD=password -d -p 5432:5432 postgres:alpine
