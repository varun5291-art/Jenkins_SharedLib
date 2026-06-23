def call() {
    dependencyCheck(
        additionalArguments: '--scan ./ --noupdate --disableNodeAudit',
        odcInstallation: 'OWASP'
    )

    dependencyCheckPublisher(
        pattern: '**/dependency-check-report.xml'
    )
}
