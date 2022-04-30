import pandas as pd
from mlxtend.frequent_patterns import apriori


HOME = 'arquivos_csv_ocorrencias_de_configuracoes/'
PREFIX = 'configOccurrences-Detailed-covidnow-'
CSVs = ['Random', 'OneDisabled', 'OneEnabled', 'MostEnabledDisabled', 'Pairwise']
NUM_RESOURCES = 14

dfs = []
for f in CSVs:
    dfs.append(pd.read_csv(HOME + PREFIX + f + '.csv'))

def mine_itemsets_and_save(df, output_csv_name):
    fim = apriori(df, min_support=0.1, use_colnames=True)
    fim['itemset_size'] = [len(s) for s in fim['itemsets']]
    fim['itemsets'] = [set(s) for s in fim['itemsets']] # frozenset to set, list, etc
    fim.sort_values(by=['support', 'itemset_size'], ascending=[False, True], inplace=True)
    fim.to_csv(output_csv_name, index=False)


for i in range(len(CSVs)):
    mine_itemsets_and_save(dfs[i], 'itemsets_active_only_dataset_' + CSVs[i] + '.csv')


dfs_inactive = []
for df in dfs:
    dfs_inactive.append(df.copy(deep=True))

for df in dfs_inactive:
    if len(df.columns) == NUM_RESOURCES:
        for i in range(len(df.columns)):
            nc = df.columns[i] + '0'
            df[nc] = [not b for b in df[df.columns[i]]]


for i in range(len(CSVs)):
    mine_itemsets_and_save(dfs_inactive[i], 'itemsets_in_active_dataset_' + CSVs[i] + '.csv')
