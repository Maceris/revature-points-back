# README

## Contributing
1. Create your feature branch: `git checkout -b new_branch_name`
2. Stage your changes for commit `git add .`
3. Commit your changes: `git commit -am 'Add some feature'`
4. Push to the branch: `git push origin new_branch_name`
5. Submit a pull request to the Dev Branch when you are done with your feature, do NOT push directly

## Development Workflow

* The `master` branch at any time represents a stable (and tested) build of the code base.
* The  `dev` branch should be as stable as possible but is where testing is done before being merged into `master`.
* All development work should be performed in feature branches. In most cases, feature branches will be branched off of the `dev` branch. Naming of the feature branches is up to the developer. Using your initials is helpful so we know who is working where, but not crucial. (Ex: `ma-feature_name`)
* Pull from `dev` often, and especially before submitting a pull request to make sure your feature branch has the latest codebase.   
* When commits are made be sure to describe what is done
* BEFORE submitting a pull request, ensure that your branch is up to date with `dev`
* When a feature branch is ready and up to date with `dev`, submit a pull request detailing the changes made, any dependency updates, and any other information to help with the merge.
* Pull requests require another person to review the code before they are merged in to `dev`.
* When `dev` is at a state where features are complete and tested, it will periodically be merged into `master` which is the live published branch.
