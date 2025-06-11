node_modules:
	npm install

shadow: node_modules
	npx shadow-cljs watch app

clean:
	rm -rf dev-build

.PHONY: shadow
