import pandas as pd
import matplotlib.pyplot as plt

my_data = pd.Series([15, 18, 8, 15, 16, 15, 29, 28])
my_data.plot(kind = 'box', title = 'Pairwise', ylabel = 'Failures', use_index = False)
plt.show()
