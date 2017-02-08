refreshdb: refreshdb-dev refreshdb-test

migrate-dev:
	psql -d user_manager_dev -f ./src/main/resources/db/migration.sql

migrate-test:
	psql -d user_manager_test -f ./src/main/resources/db/migration.sql

refreshdb-dev:
	dropdb --if-exists -e user_manager_dev
	createdb -e user_manager_dev
	psql -d user_manager_dev -f ./src/main/resources/db/migration.sql

refreshdb-test:
	dropdb --if-exists -e user_manager_test
	createdb -e user_manager_test
	psql -d user_manager_test -f ./src/main/resources/db/migration.sql

tests:
	./gradlew clean test build

start:
	java -jar build/libs/osusume-java-spring-0.0.1-SNAPSHOT.jar

runci:
	./bin/ci.sh

docker-build:
	docker build -f ./ci/Dockerfile  -t tokyobeach/user_manager_spring .

docker-push:
	docker push tokyobeach/user_manager_spring
