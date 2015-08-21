client {
    harvesterId = 'genericHarvester'
    description = 'Generic Harvester'
    base = ''
    autoStart = true
    siPath = 'applicationContext-SI-harvester-console.xml'
    classPathEntries = []
}
file {
    runtimePath = 'runtime/harvester-config-console.groovy'
    customPath = 'custom/harvester-config-console.groovy'
    ignoreEntriesOnSave = ['runtime']
}
harvest {
    pollRate = '5000'
    pollTimeout = '30000'
    scripts {
        scriptBase = 'resources/scripts/'
        preBuild = []
        preAssemble = [['merge.groovy': 'merge-config.groovy']]
        postBuild = [['update_last_harvest_ts.groovy': ''], ['saveconfig.groovy': '']]
    }
}
lastSaved = '2015-06-05 01:08:25'
redboxTemplatePath = 'resources/scripts/template-data/template.json'
