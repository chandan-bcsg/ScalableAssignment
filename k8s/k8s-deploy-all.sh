#!/bin/bash

echo "Starting Kubernetes Deployments..."

# Deploy PostgreSQL
kubectl apply -f postgres-deployment.yaml

# Deploy MongoDB
kubectl apply -f mongo-deployment.yaml

# Deploy Order Service
kubectl apply -f order-service-deployment.yaml
kubectl apply -f order-service-service.yaml

# Deploy User Service
kubectl apply -f user-service-deployment.yaml
kubectl apply -f user-service-service.yaml

# Deploy API Gateway
kubectl apply -f api-gateway-deployment.yaml

echo "All Services Deployed!"
