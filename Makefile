# A quick-and-dirty makefile for making the tarball for the exam

# +----------+--------------------------------------------------------
# | Settings |
# +----------+

# The user.  Please replace with your username.
USER=rebelsky

# The files that go in the tarball.  If you add things to the repo,
# you should update this.
FILES= \
        $(USER)/Makefile \
        $(USER)/README.md \
        $(USER)/.git \
        $(USER)/.gitignore \
        $(USER)/Problem1/.classpath \
        $(USER)/Problem1/.project \
        $(USER)/Problem1/src/Dictionary.java \
        $(USER)/Problem1/src/OpenHashTable.java \
        $(USER)/Problem2/.classpath \
        $(USER)/Problem2/.project \
        $(USER)/Problem2/src/JSON.java \
        $(USER)/Problem2/src/JSONExpt.java \
        $(USER)/Problem2/src/JSONInteractiveExpt.java \
        $(USER)/Problem3/heaps.md \
        $(USER)/Problem4/.classpath \
        $(USER)/Problem4/.project \
        $(USER)/Problem4/src/Misc.java \
        $(USER)/Problem4/src/Stamps.java \
        $(USER)/Problem5/patterns.md

# +------------------+------------------------------------------------
# | Standard Targets |
# +------------------+

.PHONY: default
default: tarball

.PHONY: clean
clean: 
	rm -rf 

# +----------------+--------------------------------------------------
# | Custom Targets |
# +----------------+

# Create the standard tarball
.PHONY: tarball
tarball: clean
	tar -C.. -cvzf $(USER).tar.gz $(FILES)

