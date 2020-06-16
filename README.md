docker build -t knote-java 

docker network create knote

docker run --name=mongo --rm --network=knote mongo

docker run --name=knote-java --rm --network=knote -p 8080:8080 -e MONGO_URL=mongodb://mongo:27017/dev knote-java

docker tag knote-java luannh/knote-java:1.0.0

docker push luannh/knote-java:1.0.0

minikube start

kubectl apply -f kube

kubectl get pods -l app=knote --watch

kubectl scale --replicas=2 deployment/knote

minikube service knote